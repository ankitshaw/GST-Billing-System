package bs;

import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author Phuc Anh
 */
class ComboKeyHandler extends KeyAdapter {
  private final JComboBox<String> comboBox;
  private final List<String> list = new ArrayList<>();
  private boolean shouldHide;

  public ComboKeyHandler(JComboBox<String> combo) {
    super();
    this.comboBox = combo;
    for (int i = 0; i < comboBox.getModel().getSize(); i++) {
      list.add((String) comboBox.getItemAt(i));
    }
  }
  @Override public void keyTyped(final KeyEvent e) {
    EventQueue.invokeLater(new Runnable() {
      @Override public void run() {
        String text = ((JTextField) e.getComponent()).getText();
        ComboBoxModel<String> m;
        if (text.isEmpty()) {
          String[] array = list.toArray(new String[list.size()]);
          m = new DefaultComboBoxModel<String>(array);
          setSuggestionModel(comboBox, m, "");
          comboBox.hidePopup();
        } else {
          m = getSuggestedModel(list, text);
          if (m.getSize() == 0 || shouldHide) {
            comboBox.hidePopup();
          } else {
            setSuggestionModel(comboBox, m, text);
            comboBox.showPopup();
          }
        }
      }
    });
  }
  @Override public void keyPressed(KeyEvent e) {
    JTextField textField = (JTextField) e.getComponent();
    String text = textField.getText();
    shouldHide = false;
    switch (e.getKeyCode()) {
    case KeyEvent.VK_RIGHT:
      for (String s : list) {
        if (s.startsWith(text)) {
          textField.setText(s);
          return;
        }
      }
      break;
    case KeyEvent.VK_ENTER:
      if (!list.contains(text)) {
        //list.add(text);
        Collections.sort(list);
        //setSuggestionModel(comboBox, new DefaultComboBoxModel(list), text);
        setSuggestionModel(comboBox, getSuggestedModel(list, text), text);
      }
      shouldHide = true;
      break;
    case KeyEvent.VK_ESCAPE:
      shouldHide = true;
      break;
    default:
      break;
    }
  }
  private static void setSuggestionModel(
      JComboBox<String> comboBox, ComboBoxModel<String> mdl, String str) {
    comboBox.setModel(mdl);
    comboBox.setSelectedIndex(-1);
    ((JTextField) comboBox.getEditor().getEditorComponent()).setText(str);
  }
  private static ComboBoxModel<String> getSuggestedModel(List<String> list, String text) {
    DefaultComboBoxModel<String> m = new DefaultComboBoxModel<>();
    for (String s : list) {
      if (s.startsWith(text)) {
        m.addElement(s);
      }
    }
    return m;
  }
}
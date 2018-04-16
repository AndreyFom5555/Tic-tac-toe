import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    public MainForm() {
        setTitle("Крестики-нолики");
        setBounds(300, 300, 455, 525);
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        MainGameField gameField = MainGameField.getInstance();
        // РЎРѕР·РґР°С‘Рј РїР°РЅРµР»СЊ РґР»СЏ РєРЅРѕРїРѕРє
        JPanel buttonPanel = new JPanel(new GridLayout());
        add(gameField, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
        JButton btnStart = new JButton("Start Game!!!");
        JButton btnEnd = new JButton("END AND EXIT");
        buttonPanel.add(btnStart);
        buttonPanel.add(btnEnd);
        btnEnd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(btnStart.getText());
                GameSettingsForm gameSettingsForm = new GameSettingsForm();
            }
        });
        setVisible(true);
    }
}

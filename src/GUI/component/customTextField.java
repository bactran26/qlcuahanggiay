/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI.component;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JTextField;

/**
 *
 * @author cuong
 */
public class customTextField extends JTextField {

    private int border = 1;
    private int borderRadius = 10;
    private Color borderColor = Color.BLACK;

    public customTextField() {
        setOpaque(false);
        setMargin(new Insets(0, 10, 0, 10));
    }

    public customTextField(String text) {
        this();
        this.setText(text);

    }

    public void setBorder(int border) {
        this.border = border;
    }

    public int getBorderRadius() {
        return borderRadius;
    }

    public void setBorderRadius(int borderRadius) {
        this.borderRadius = borderRadius;
    }

    public Color getBorderColor() {
        return borderColor;
    }

    public void setBorderColor(Color borderColor) {
        this.borderColor = borderColor;
    }
    

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2D.setColor(getBackground());
        g2D.fillRoundRect(0, 0, getWidth(), getHeight(), borderRadius, borderRadius);

        super.paintComponent(g);
    }

    @Override
    protected void paintBorder(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        g2D.setStroke(new BasicStroke(border));
        g2D.setColor(borderColor);
        g2D.drawRoundRect(0, 0, getWidth() - 1, getHeight() - 1, borderRadius, borderRadius);

    }
}

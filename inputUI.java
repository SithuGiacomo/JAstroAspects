/*
 * Copyright (c) 2021 Sithu Aung.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.*;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;

public class inputUI extends JFrame {

    JLabel labSu = new JLabel("Sun: ");
    JLabel labMo = new JLabel("Mon: ");
    JLabel labMa = new JLabel("Mar: ");
    JLabel labMe = new JLabel("Mer: ");
    JLabel labJu = new JLabel("Jup: ");
    JLabel labVe = new JLabel("Ven: ");
    JLabel labSa = new JLabel("Sat: ");
    JLabel labRa = new JLabel("Rah: ");
    JLabel labKe = new JLabel("Ket: ");
    JLabel labFo = new JLabel("For");
    JLabel labI = new JLabel("Asc: ");
    JLabel labII = new JLabel("II: ");
    JLabel labIII = new JLabel("III: ");
    JLabel labIV = new JLabel("IV: ");
    JLabel labV = new JLabel("V: ");
    JLabel labVI = new JLabel("VI: ");
    JLabel labVII = new JLabel("VII: ");
    JLabel labVIII = new JLabel("VIII: ");
    JLabel labIX = new JLabel("IX: ");
    JLabel labX = new JLabel("X: ");
    JLabel labXI = new JLabel("XI: ");
    JLabel labXII = new JLabel("XII ");
    JLabel plHolder2 = new JLabel(" ");
    JLabel plHolder3 = new JLabel(" ");

    JTextField txtSu = new JTextField(10);
    JTextField txtMo = new JTextField(10);
    JTextField txtMa = new JTextField(10);
    JTextField txtMe = new JTextField( 10);
    JTextField txtJu = new JTextField(10);
    JTextField txtVe = new JTextField(10);
    JTextField txtSa = new JTextField(10);
    JTextField txtRa = new JTextField(10);
    JTextField txtKe = new JTextField(10);
    JTextField txtFo = new JTextField(10);
    JTextField txtI = new JTextField(10);
    JTextField txtII = new JTextField(10);
    JTextField txtIII = new JTextField(10);
    JTextField txtIV = new JTextField(10);
    JTextField txtV = new JTextField(10);
    JTextField txtVI = new JTextField(10);
    JTextField txtVII = new JTextField(10);
    JTextField txtVIII = new JTextField(10);
    JTextField txtIX = new JTextField(10);
    JTextField txtX = new JTextField(10);
    JTextField txtXI = new JTextField(10);
    JTextField txtXII = new JTextField(10);

    final boolean chkSu = false;
    final boolean chkMo = false;
    JCheckBox chkMa = new JCheckBox(": Retro");
    JCheckBox chkMe = new JCheckBox(": Retro");
    JCheckBox chkJu = new JCheckBox(": Retro");
    JCheckBox chkVe = new JCheckBox(": Retro");
    JCheckBox chkSa = new JCheckBox(": Retro");
    final boolean chkRa = false;
    final boolean chkKe = false;
    final boolean chkFo = false;
    final boolean chkI = false;
    final boolean chkII = false;
    final boolean chkIII = false;
    final boolean chkIV = false;
    final boolean chkV = false;
    final boolean chkVI = false;
    final boolean chkVII = false;
    final boolean chkVIII = false;
    final boolean chkIX = false;
    final boolean chkX = false;
    final boolean chkXI = false;
    final boolean chkXII = false;

    JButton buttonInput = new JButton("Calculate");

    public inputUI() {
        super("JAstroAspects - v0.01Alpha");

        // create the planet panel with GridBagLayout manager
        JPanel planetPanel = new JPanel(new GridBagLayout());
        planetPanel.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), BorderFactory.createTitledBorder("Planets")));
        GridBagConstraints planetConstraints = new GridBagConstraints();
        planetConstraints.anchor = GridBagConstraints.WEST;
        planetConstraints.insets = new Insets(5, 5, 5, 5);

        // add components to the planet panel
        planetConstraints.gridx = 0;
        planetConstraints.gridy = 0;
        planetPanel.add(labSu, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtSu, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 1;
        planetPanel.add(labMo, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtMo, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 2;
        planetPanel.add(labMa, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtMa, planetConstraints);
        planetConstraints.gridx = 2;
        planetPanel.add(chkMa, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 3;
        planetPanel.add(labMe, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtMe, planetConstraints);
        planetConstraints.gridx = 2;
        planetPanel.add(chkMe, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 4;
        planetPanel.add(labJu, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtJu, planetConstraints);
        planetConstraints.gridx = 2;
        planetPanel.add(chkJu, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 5;
        planetPanel.add(labVe, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtVe, planetConstraints);
        planetConstraints.gridx = 2;
        planetPanel.add(chkVe, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 6;
        planetPanel.add(labSa, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtSa, planetConstraints);
        planetConstraints.gridx = 2;
        planetPanel.add(chkSa, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 7;
        planetPanel.add(labRa, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtRa, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 8;
        planetPanel.add(labKe, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtKe, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 9;
        planetPanel.add(labFo, planetConstraints);
        planetConstraints.gridx = 1;
        planetPanel.add(txtFo, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 10;
        planetPanel.add(plHolder2, planetConstraints);

        planetConstraints.gridx = 0;
        planetConstraints.gridy = 11;
        planetPanel.add(plHolder3, planetConstraints);

        // create house panel with GridBagLayout manager
        JPanel housePanel = new JPanel(new GridBagLayout());
        housePanel.setBorder(new CompoundBorder(new EmptyBorder(10, 10, 10, 10), BorderFactory.createTitledBorder("Houses")));
        GridBagConstraints houseConstraints = new GridBagConstraints();
        houseConstraints.anchor = GridBagConstraints.WEST;
        houseConstraints.insets = new Insets(5, 5, 5, 5);

        // add components to house panel
        houseConstraints.gridx = 4;
        houseConstraints.gridy = 0;
        housePanel.add(labI, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtI, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 1;
        housePanel.add(labII, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtII, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 2;
        housePanel.add(labIII, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtIII, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 3;
        housePanel.add(labIV, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtIV, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 4;
        housePanel.add(labV, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtV, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 5;
        housePanel.add(labVI, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtVI, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 6;
        housePanel.add(labVII, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtVII, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 7;
        housePanel.add(labVIII, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtVIII, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 8;
        housePanel.add(labIX, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtIX, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 9;
        housePanel.add(labX, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtX, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 10;
        housePanel.add(labXI, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtXI, houseConstraints);

        houseConstraints.gridx = 4;
        houseConstraints.gridy = 11;
        housePanel.add(labXII, houseConstraints);
        houseConstraints.gridx = 5;
        housePanel.add(txtXII, houseConstraints);

        // create button panel with GridBagLayout manager
        JPanel buttonPanel = new JPanel(new GridBagLayout());
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(0,10,10,10));
        GridBagConstraints buttonConstraints = new GridBagConstraints();
        buttonConstraints.anchor = GridBagConstraints.WEST;
        buttonConstraints.insets = new Insets(5,5,5,5);

        // add components to button panel
        buttonConstraints.gridx = 0;
        buttonConstraints.gridy = 0;
        buttonPanel.add(buttonInput,buttonConstraints);

        // button click and scan usr input
        buttonInput.addActionListener(ae -> {
            if (ae.getSource() == buttonInput) {
                // getting usr input data from text field
                // changing usr input data type into int
                int su = Integer.parseInt(txtSu.getText());
                int mo = Integer.parseInt(txtMo.getText());
                int ma = Integer.parseInt(txtMa.getText());
                int me = Integer.parseInt(txtMe.getText());
                int ju = Integer.parseInt(txtJu.getText());
                int ve = Integer.parseInt(txtVe.getText());
                int sa = Integer.parseInt(txtSa.getText());
                int ra = Integer.parseInt(txtRa.getText());
                int ke = Integer.parseInt(txtKe.getText());
                int fo = Integer.parseInt(txtFo.getText());
                int I = Integer.parseInt(txtI.getText());
                int II = Integer.parseInt(txtII.getText());
                int III = Integer.parseInt(txtIII.getText());
                int IV = Integer.parseInt(txtIV.getText());
                int V = Integer.parseInt(txtV.getText());
                int VI = Integer.parseInt(txtVI.getText());
                int VII = Integer.parseInt(txtVII.getText());
                int VIII = Integer.parseInt(txtVIII.getText());
                int IX = Integer.parseInt(txtIX.getText());
                int X = Integer.parseInt(txtX.getText());
                int XI = Integer.parseInt(txtXI.getText());
                int XII = Integer.parseInt(txtXII.getText());

                // calling inputCheck.java
                inputCheck inputCheckObj = new inputCheck();

                // calling inputCheck.java -> myArray to check whether data are exceeding 360 or not
                inputCheckObj.myArray(su, mo, ma, me, ju, ve, sa, ra, ke, fo, I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII);

                // checking 180(Opposition) rule
                int tmpRa_KeChk1 = ra - ke;
                int tmpRa_KeChk2 = ke - ra;
                int tmpI_VIIChk1 = I - VII;
                int tmpI_VIIChk2 = VII - I;
                int tmpII_VIIIChk1 = II - VIII;
                int tmpII_VIIIChk2 = VIII - II;
                int tmpIII_IXChk1 = III - IX;
                int tmpIII_IXChk2 = IX - III;
                int tmpIV_XChk1 = IV - X;
                int tmpIV_XChk2 = X - IV;
                int tmpV_XIChk1 = V - XI;
                int tmpV_XIChk2 = XI - V;
                int tmpVI_XIIChk1 = VI - XII;
                int tmpVI_XIIChk2 = XII - VI;

                // calling inputCheck.java -> chk180 to check 180(Opposition) rule
                inputCheckObj.chk180(tmpRa_KeChk1,tmpRa_KeChk2,tmpI_VIIChk1,tmpI_VIIChk2,tmpII_VIIIChk1,tmpII_VIIIChk2,tmpIII_IXChk1,tmpIII_IXChk2, tmpIV_XChk1,tmpIV_XChk2,tmpV_XIChk1,tmpV_XIChk2,tmpVI_XIIChk1,tmpVI_XIIChk2);

                // checking whether Retro checkboxes are checked or not
                if (chkMa.isSelected() || chkMe.isSelected() || chkJu.isSelected() || chkVe.isSelected() || chkSa.isSelected()) {
                    System.out.println("Some planets are in retro.");
                }
                else {
                    System.out.println("You don't have any retro planet.");
                }

                pnhData suObj = new pnhData("Sun", su,chkSu);
                pnhData moObj = new pnhData("Moon",mo,chkMo);
                pnhData maObj = new pnhData("Mars",ma,chkMa.isSelected());
                pnhData meObj = new pnhData("Mercury",mo,chkMe.isSelected());
                pnhData juObj = new pnhData("Jupiter",mo,chkJu.isSelected());
                pnhData veObj = new pnhData("Venus",mo,chkVe.isSelected());
                pnhData saObj = new pnhData("Saturn",mo,chkSa.isSelected());
                pnhData raObj = new pnhData("Rahu",mo,chkRa);
                pnhData keObj = new pnhData("Ketu",mo,chkKe);
                pnhData foObj = new pnhData("For",mo,chkFo);
                pnhData IObj = new pnhData("I",mo,chkI);
                pnhData IIObj = new pnhData("II",mo,chkII);
                pnhData IIIObj = new pnhData("III",mo,chkIII);
                pnhData IVObj = new pnhData("IV",mo,chkIV);
                pnhData VObj = new pnhData("V",mo,chkV);
                pnhData VIObj = new pnhData("VI",mo,chkVI);
                pnhData VIIObj = new pnhData("VII",mo,chkVII);
                pnhData VIIIObj = new pnhData("VIII",mo,chkVIII);
                pnhData IXObj = new pnhData("IX",mo,chkIX);
                pnhData XObj = new pnhData("X",mo,chkX);
                pnhData XIObj = new pnhData("XI",mo,chkXI);
                pnhData XIIObj = new pnhData("XII",mo,chkXII);

                System.exit(0);
            }
        });



        // creating bgPanel which holds planetPanel, housePanel and buttonPanel
        JPanel bgPanel = new JPanel(new GridBagLayout());
        GridBagConstraints bgPanelConstraints = new GridBagConstraints();
        bgPanelConstraints.anchor = GridBagConstraints.WEST;
        bgPanelConstraints.insets = new Insets(5,5,5,5);
        bgPanelConstraints.gridx = 0;
        bgPanelConstraints.gridy = 0;
        bgPanel.add(planetPanel,bgPanelConstraints);
        bgPanelConstraints.gridx = 1;
        bgPanelConstraints.gridy = 0;
        bgPanel.add(housePanel,bgPanelConstraints);
        bgPanelConstraints.gridx = 1;
        bgPanelConstraints.gridy = 1;
        bgPanel.add(buttonPanel,bgPanelConstraints);

        // add bgPanel to JFrame and wrapping up JFrame
        add(bgPanel);
        pack();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        // inputUI() and JFrame will be shown on Main instead of here
    }
}

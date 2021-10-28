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

import javax.swing.*;

public class inputCheck {
    public void myArray(int su, int mo, int ma, int me, int ju, int ve, int sa, int ra, int ke, int fo,
                        int I, int II, int III, int IV, int V, int VI, int VII, int VIII, int IX, int X, int XI, int XII) {
        int[] arrayData = {su, mo, ma, me, ju, ve, sa, ra, ke, fo, I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII};
        int arrayTarget = 360;
        boolean hitTarget = false; // by default, planets & houses data should not exceed 359
        for (int array : arrayData) { // array against arrayData set
            if (array >= arrayTarget) { // if array is equal or greater than 360
                hitTarget = true; // hitTarget is true and error message out
                break;
            }
        }
        if (hitTarget) {
            System.out.println("Error! One of your planets or Houses input is exceeding 359 degree.");
            JOptionPane.showMessageDialog(null,"Error!","Error!",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        } else {
            System.out.println("Okay, 360 degree rule is satisfied");
        }
    }

    public void chk180(int tmpRa_KeChk1,int tmpRa_KeChk2,int tmpI_VIIChk1,int tmpI_VIIChk2,int tmpII_VIIIChk1,int tmpII_VIIIChk2,int tmpIII_IXChk1,int tmpIII_IXChk2,
                       int tmpIV_XChk1,int tmpIV_XChk2,int tmpV_XIChk1,int tmpV_XIChk2,int tmpVI_XIIChk1,int tmpVI_XIIChk2)
    {
        // (tmpRa_KeChk1 == 180) and (tmpRa_KeChk2 == 180) only one of them can be true
        // if Ra > Ke then tmpRa_KeChk1 will be invoked
        // if Ke > Ra then tmpRa-KeChk2 will be invoked
        // but all 180 rules must be satisfied without exception
        // if any pair resulted over or under 180, error msg out
        if (((tmpRa_KeChk1 == 180) || (tmpRa_KeChk2 == 180)) && ((tmpI_VIIChk1 == 180) || (tmpI_VIIChk2 == 180)) && ((tmpII_VIIIChk1 == 180) || (tmpII_VIIIChk2 == 180)) && ((tmpIII_IXChk1 == 180) || (tmpIII_IXChk2 == 180)) && ((tmpIV_XChk1 == 180) || (tmpIV_XChk2 == 180)) && ((tmpV_XIChk1 == 180) || (tmpV_XIChk2 == 180)) && ((tmpVI_XIIChk1 == 180) || (tmpVI_XIIChk2 == 180)))
        {
            System.out.println("Okay, Everything look good.");
        }
        else {
            System.out.println("Error. One of your planet or house data input is invalid. \nIt cannot satisfy 180 opposition rule.");
            JOptionPane.showMessageDialog(null,"Error!","Error",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbuku;

/**
 *
 * @author otnie
 */
enum TipeBuku {
    PELAJARAN, TUTORIAL, NOVEL;

//    static TipeBuku valueOf(TipeBuku tipe) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String toString() {
        switch (this) {
            case PELAJARAN:
                return "Pelajaran";

            case TUTORIAL:
                return "Tutorial";

            default:
                return "Novel";

        }

    }

}
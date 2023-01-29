/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladormemoriavirtual;

/**
 *
 * @author nadja e natiele
 */
public class Processo {
        private int Xbytes; //NUMERO DE PAGINAS QUE SAO ALOCADAS
        private int num; // ID DO PROCESSO
        int np=1;

    public Processo(int Xbytes) {
        this.Xbytes = Xbytes;
        this.num = np;
        np++;
    }
    
    public Processo(int Xbytes, int i) {
        this.Xbytes = Xbytes;
        this.num = i;
    }

    public int getXbytes() {
        return Xbytes;
    }

    public void setXbytes(int Xbytes) {
        this.Xbytes = Xbytes;
    }
        
    public int getNum(){
        return this.num;
    }    
    
}

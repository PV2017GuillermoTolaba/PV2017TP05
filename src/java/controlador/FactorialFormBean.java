/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import ok.NewClass;

/**
 *
 * @author WallHero
 */
@ManagedBean
@SessionScoped
public class FactorialFormBean {
    private long n;
    private long o;
    private long p;
    private long q;
    public FactorialFormBean() {
    }
    public long calcularEntrada(int opcion)
    {
        switch(opcion)
        {
            case 1:
            {
                NewClass fac = new NewClass();
                fac.asignarValor(this.n);
                fac.factorialx();
                return fac.obtenerFactorial();                
            }
            case 2:
            {
                NewClass sum = new NewClass();
                sum.asignarValorsum(this.getO());
                sum.sumatoriaX();
                return sum.obtenerSumatoria();               
            }
            case 3:
            {
                NewClass prod = new NewClass();
                prod.asignarValorProduc(this.getP(), this.getQ());
                prod.productoriaX();
                return prod.obtenerProduc();                
            }
            default:{}
        }
        return -1;
    }

    public long getN() {
        return n;
    }
    public void setN(long n) {
        this.n = n;
    }
    public long getO() {
        return o;
    }
    public void setO(long o) {
        this.o = o;
    }
    public long getP() {
        return p;
    }
    public void setP(long p) {
        this.p = p;
    }
    public long getQ() {
        return q;
    }
    public void setQ(long q) {
        this.q = q;
    }
    
}

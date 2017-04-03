
package ok;

import java.util.Scanner;
import static javaapplication2.JavaApplication2.veces;

/**
 *
 * @author WallHero
 */
public class NewClass {
    private long var;
    private long var2;
    private long var3;
    private long var4;
    private long produc;
    public NewClass() {
    }
    public void asignarValor(long xd)
    {
        setVar(xd);
    }
    public void factorialx()
    {
        long b = this.var;
        if(b == 1 || b == 0) this.var = 1; 
        while(true)
        {
            if(b == 1 || b == 0) break;
            b--;
            this.var=this.var*b;
        }        
    }
    public long obtenerFactorial() 
    {
        return getVar();
    }
    public void asignarValorsum(long xd){
        this.var2 = xd;
    }
    public void sumatoriaX(){
        long b = 0;
        long c = this.var2;
        while(true)
        {
            if(b == c) break;
            this.var2 = this.var2+b;
            b++;
        }
    }
    public long obtenerSumatoria()
    {
        return this.var2;
    }

    public void asignarValorProduc(long xd, long xde)
    {
        this.var3 = xd;
        this.var4 = xde;
    }
    public void productoriaX()
    {
        produc = var4;
        while(true)
        {
            if(var3 >= var4) break; 
            produc = produc * var3;
            var3++;
        }
    }
    public long obtenerProduc()
    {
        return this.produc;
    }
    public void factorial(String[] args){
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        if (veces != 0 ) System.out.println("Ingrese un número positivo.");
        System.out.println("Ingrese el número al que desea sacar el factorial.\nIngreso:");
        a = sc.nextInt();
        if(a < 0) 
        {
            veces++;
            factorial(args);
            return ;
        }
        if (a == 0) 
        {
            System.out.println("El factorial de 0 es 1");
            factorial(args);
            return ;
        }
        b = a;    
        c = a;
        while(true)
        {
            if(b == 1 || b == 0) break;
            b--;
            a=a*b;
        }
        veces = 0;
        System.out.println("El factorial de " + c + " es "+ a);
        factorial(args);
    }

    /**
     * @return the var
     */
    public long getVar() {
        return var;
    }

    /**
     * @param var the var to set
     */
    public void setVar(long var) {
        this.var = var;
    }

}

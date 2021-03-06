package model;

import java.util.ArrayList;

public class ComplejoPolar {
    // 1. Estructura de complejos en forma polar
    public double modulo;
    public double argumento;
    
    public ComplejoPolar () {
        this.modulo = 0;
        this.argumento = 0;
    }
    
    public ComplejoPolar(double mod, double arg) {
        this.modulo = mod;
        this.argumento = arg;
    }
    
    // 2. Funciones set/get
    public double getModulo () {
        return this.modulo;
    }
    
    public void setModulo (double mod) {
        this.modulo = mod;
    }
    
    public double getArgumento () {
        return this.argumento;
    }
    
    public void setArgumento (double arg) {
        this.argumento = arg;
    }
    
    // 3. Operaciones avanzadas
    public ComplejoPolar producto( ComplejoPolar complejoPol ) {
        this.modulo *= complejoPol.modulo;
        this.argumento += complejoPol.argumento;
        return this;
    }

    public ComplejoPolar cociente( ComplejoPolar complejoPol ) {
        this.modulo *= 1/complejoPol.modulo;
        this.argumento -= complejoPol.argumento;
        return this;
    }
    
    public ComplejoPolar potenciaNatural( int exponente ){
        this.modulo = Math.pow(this.modulo,exponente);
        this.argumento *= exponente ;
        return this;
    }
    
    public ComplejoPolar raizNEsima( int indice, int k ) {
//        this.modulo = Math.pow(this.modulo,1/indice);
        this.modulo = Math.pow(Math.E,Math.log(this.modulo)/indice);
        this.argumento = (this.argumento + 2*k*Math.PI)/indice;
        return this;
    }
    
    public Boolean esRaizPrimitiva ( int indice, int k ) {
        return obtenerMCD(k,indice)==1;
    }
    
    public ArrayList<ComplejoPolar> raicesPrimitivas( int indice ) {
        ArrayList<ComplejoPolar> raicesPrim;
        raicesPrim = new ArrayList<>();
        
        for( int k=0; k < indice; k++ ) {
            if( esRaizPrimitiva(indice,k) ) {
                ComplejoPolar w = new ComplejoPolar( 1, 2*k*Math.PI/indice );
                raicesPrim.add(w);
            }
        }
        return raicesPrim;
    }
    
    // 4. Funcion de pasaje polar->binomica
    public ComplejoPolar binomicaAPolar (ComplejoBinomica complejoBin) {
        this.modulo = elModuloDe(complejoBin.componenteReal,complejoBin.componenteImaginaria);
        
        if (complejoBin.componenteReal != 0 && complejoBin.componenteImaginaria !=0) {
            //double argumentoSinArreglo = Math.toRadians( elArcotangenteDe(complejoBin.componenteReal,complejoBin.componenteImaginaria) );
            this.argumento =elArcotangenteDe(complejoBin.componenteReal,complejoBin.componenteImaginaria) ;//arreglarArgumento(argumentoSinArreglo);
        } else {
           if(complejoBin.componenteReal == 0) {
                if(complejoBin.componenteImaginaria > 0) {
                    this.argumento = (Math.PI)/2;
                } else {
                    this.argumento = (3 * Math.PI) / 2;
                }   
           }   
          if(complejoBin.componenteImaginaria == 0) {
                if ( complejoBin.componenteReal >=0) {
                    this.argumento = 0;
                }else{
                    this.argumento = Math.PI ;
                }           
            }
        }       
        return this;
    }
    
    // Funciones secundarias
    public double arreglarArgumento (double arg) {
        while (arg > (2 * Math.PI) || arg < 0) {
            if (arg > (2 * Math.PI)) {
                arg -=(2 * Math.PI);
            }
            if (arg < 0) {
                arg += (2 * Math.PI);
            }
        }
        return arg;
    }
    
    public double elModuloDe (double re, double im) {
        return Math.sqrt(Math.pow(re, 2) + Math.pow(im, 2));
    }
    
    public double elArcotangenteDe (double re, double im) {
        return Math.atan2(im,re);
    }
    
    int obtenerMCD(int p, int q) {
        if (q == 0){
            return p;
        }else{
            return obtenerMCD(q, p % q);
        }
    }
}

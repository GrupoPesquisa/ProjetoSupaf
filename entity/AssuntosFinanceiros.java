package entity;

public class AssuntosFinanceiros {
    private int codigo, dinheiroSuficiente, dinheiroSuficienteGastos, dinheiroSuficienteAmigos;
    
    
    public AssuntosFinanceiros(int codigo, int dinheiroSuficienteGastos, int dinheiroSuficiente, int dinheiroSuficienteAmigos){
        this.codigo = codigo;
        this.dinheiroSuficiente = dinheiroSuficiente;
        this.dinheiroSuficienteGastos = dinheiroSuficienteGastos;
        this.dinheiroSuficienteAmigos = dinheiroSuficienteAmigos;       
    }

    public AssuntosFinanceiros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public int getDinheiroSuficiente(){
        return dinheiroSuficiente;
    } 
    public void setDinheiroSuficiente(int dinheiroSuficienteGastos){
        this.dinheiroSuficiente = dinheiroSuficiente;
    }
    public int getDinheiroSuficienteGastos(){
        return dinheiroSuficienteGastos;
    } 
    public void setDinheiroSuficienteGastos(int dinheiroSuficiente){
        this.dinheiroSuficienteGastos = dinheiroSuficienteGastos;
    }
    public int getDinheiroSuficienteAmigos(){
        return dinheiroSuficienteAmigos;
    } 
    public void setDinheiroSuficienteAmigos(int dinheiroSuficienteAmigos){
        this.dinheiroSuficienteAmigos = dinheiroSuficienteAmigos;
    }
};

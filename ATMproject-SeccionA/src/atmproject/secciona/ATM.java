/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atmproject.secciona;

/**
 *
 * @author joses
 */
public class ATM {
    
    private Dispensador dispensadorObj;
    private Pantalla pantallaObj;
    private RanuraDeDeposito ranuraDeDepositoObj;
    private Teclado tecladoObj;
    
    public ATM(){
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito ();
        this.tecladoObj = new Teclado();
        
        this.inicializar();
    }
    
   private void inicializar(){
       int numeroDeCuenta;
      pantallaObj.mostrarMensaje("Bienvenido!\n");
      pantallaObj.mostrarMensaje("Ingrese su numero de cuenta: ");
      numeroDeCuenta = tecladoObj.recibirEntrada();
      System.out.println("El numero de cuenta ingresado es: "+numeroDeCuenta);
        
        int nip;
      pantallaObj.mostrarMensaje("Ingrese su numero de nip: ");
      nip = tecladoObj.recibirEntrada();
      if(nip == 12345){
      System.out.println("El numero de nip ingresado es: "+ nip);
      }
      else
          {
      System.out.println("El numero de nip ingresado es incorrecto");
            }
    }
    
   public void depositar(int monto) { }
   public void acreditar(int monto) { }
   public void mostrarSaldo(int numeroDeCuenta) { }
   public void retirar(int monto) { }
   public void debitar(int monto) { }
   public boolean autenticar(int nip, int numeroDeCuenta) {return true;}
}



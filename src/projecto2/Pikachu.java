package projecto2;

/**
 *
 * @author mario
 */
public class Pikachu extends Pokemon{

    public Pikachu() {
        super("Pikachu");
    }
    //Metodos

    @Override
    public int ataque2() {//rayo
       int daño=0;
       if(pp2 > 0){
           daño=ataque * 4;}
       return daño;
    }
    
    @Override
    public int ataque3() {//trueno
        int daño=0;
       if(pp3 > 0){
           daño=ataque * 5;}
       return daño;
    }

    @Override
    public int ataque4() {//at.rapido
        int daño=0;
       if(pp4 > 0){
           daño=ataque * 2;}
       return daño;
    }
    
    
    
    
}

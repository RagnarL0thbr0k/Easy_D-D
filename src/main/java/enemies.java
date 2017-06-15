/**
 * Created by ${Ghisa} on ${06/04/2017}.
 */
public abstract class enemies {

    private String nome;
    private String razza;
    private int xp;
    private int life;

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;

        if (razza == "murdok" || razza == "Murdok"){
            xp = 5;

        }if ((razza == "ladro") || (razza == "Ladro")){
            xp = 10;

        }if ((razza == "drago") || (razza == "Drago")){
            xp = 50;
        }
    }
}

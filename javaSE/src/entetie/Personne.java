package entetie;

import java.time.LocalDate;
import java.util.Date;


public abstract class Personne {

    protected static int id = 0 ;
    protected int idd;
    protected String name ;
    protected Date Age ;
    protected Fonction fonction;
    protected LocalDate enciente ;
    protected int bonus ;


    public Personne(String name, Date age, Fonction fonction) {
        System.out.println("Initializing abstractClass with Constructor public entetie.Personne(String name, Date age, entetie.Fonction fonction)");
        this.id = ++id;
        this.idd = id;
        this.enciente= LocalDate.now();
        this.name = name;
        Age = age;
        this.fonction = fonction;
        this.bonus = 0 ;
    }

    abstract void incrementBonus();

    public int getIdd() {
        return idd;
    }

    public void setIdd(int idd) {
        this.idd = idd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAge() {
        return Age;
    }

    public void setAge(Date age) {
        Age = age;
    }

    public Fonction getFonction() {
        return fonction;
    }

    public void setFonction(Fonction fonction) {
        this.fonction = fonction;
    }

    public LocalDate getEnciente() {
        return enciente;
    }

    public void setEnciente(LocalDate enciente) {
        this.enciente = enciente;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

package champollion;

public class ServicePrevu {

    private int volCM;
    private int volTD;
    private int volTP;
    private Enseignant e;
    private UE u;

    public ServicePrevu(int volCM, int volTD, int volTP, Enseignant e, UE u) {
        this.volCM = volCM;
        this.volTD = volTD;
        this.volTP = volTP;
        this.e = e;
        this.u = u;
    }

    public int getVolCM() {
        return volCM;
    }

    public int getVolTD() {
        return volTD;
    }

    public int getVolTP() {
        return volTP;
    }

    public Enseignant getE() {
        return e;
    }

    public UE getU() {
        return u;
    }

    public void setVolCM(int volCM) {
        this.volCM = volCM;
    }

    public void setVolTD(int volTD) {
        this.volTD = volTD;
    }

    public void setVolTP(int volTP) {
        this.volTP = volTP;
    }

    public void setE(Enseignant e) {
        this.e = e;
    }

    public void setU(UE u) {
        this.u = u;
    }
   
}

package _14_Encapsulation.Q01;

public class Araba {//pojo class 1)fiels, 2)getter-setter, 3)to string, 4)cons olur
    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba() {
    }

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        // this.motor=motor;
        // this.yil=yil;<
        setMotor(motor);
        setYil(yil);
    }

    public Araba(int motor, int yil) {
        setYil(yil);
        setMotor(motor);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        if(motor<100){
            System.out.println("Motor gücü 100'ün üzerinde olmalıdır.\n Düzelterek giriş yapın");
        }else
        this.motor = motor;
    }

    public int getYil() {

        return yil;
    }

    public void setYil(int yil) {
        if (yil < 0) {
            this.yil = (-1) * yil;
            System.out.println("Yıl değerini yanlış girdiniz, kontrol ediniz");
        } else this.yil = yil;

    }

    @Override
    public String toString() {//bu method, bu classdan create edilen objeleri değerlei ile yazdırmak için kullanılır.
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}

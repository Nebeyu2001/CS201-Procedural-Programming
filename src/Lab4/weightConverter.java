package Lab4;

public class weightConverter {

    private double weight;

    public weightConverter(double weight){

        this.weight = weight;


    }

    public double convert(double weight){

        this.weight=weight * 0.167;

        return this.weight;

    }

    public static void main(String[] args){

        weightConverter moonWeight = new weightConverter(200);

        System.out.println("yourMoonWeight = " + moonWeight.convert(200));


    }

}

public class Main {
    public static void main(String[] args) {
        Train train = new Train("Ласточка"," B-901", 2011,"Россия",null,0,3500,301,"Белорусский вокзал",11,"Минск-Пассажирский");
        Train train1 = new Train("Ленинград","D-125",2019,"Россия",null,0,1700,270,"Ленинградский вокзал",8,"Ленинград-Пассажирский");
        System.out.println(train);
        System.out.println(train1);
        GrassEater gazel = new GrassEater();
        GrassEater zhiraf = new GrassEater();
        GrassEater loshad = new GrassEater();
        Hunter giena = new Hunter();
        Hunter tigr = new Hunter();
        Hunter medved = new Hunter();
        Eartheater frog = new Eartheater();
        Eartheater uzh = new Eartheater();
        NotFlyBird dodo = new NotFlyBird();
        NotFlyBird pingvin = new NotFlyBird();
        NotFlyBird pavlin = new NotFlyBird();
        FlyBird chaika = new FlyBird();
        FlyBird albatros = new FlyBird();
        FlyBird socol = new FlyBird();
    }
}

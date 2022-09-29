public class Main {
    public static void main(String[] args) {
        Train train = new Train("Ласточка"," B-901", 2011,"Россия",null,0,3500,301,"Белорусский вокзал",11,"Минск-Пассажирский");
        Train train1 = new Train("Ленинград","D-125",2019,"Россия",null,0,1700,270,"Ленинградский вокзал",8,"Ленинград-Пассажирский");
        System.out.println(train);
        System.out.println(train1);
        Bus bus = new Bus("Икарус","r2d2",1980,"Россия","Желтый",60,"Школьный");
        Bus bus1 = new Bus("Икарус","r2d2",1980,"Россия","Белый",60,"Скорой помощи");
        Bus bus2 = new Bus("Икарус","r2d2",1980,"Россия","Синый",60,"Маршрутный");
        GrassEater gazel = new GrassEater();
        GrassEater zhiraf = new GrassEater();
        GrassEater loshad = new GrassEater();
        Hunter giena = new Hunter();
        Hunter tigr = new Hunter();
        Hunter medved = new Hunter();
        Earthwater frog = new Earthwater();
        Earthwater uzh = new Earthwater();
        NotFlyBird dodo = new NotFlyBird();
        NotFlyBird pingvin = new NotFlyBird();
        NotFlyBird pavlin = new NotFlyBird();
        FlyBird chaika = new FlyBird();
        FlyBird albatros = new FlyBird();
        FlyBird socol = new FlyBird();
        System.out.println(gazel.equals(zhiraf));
    }
}

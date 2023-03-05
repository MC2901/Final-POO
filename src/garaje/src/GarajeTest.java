package garaje.src;

public class GarajeTest {
    public static void main(String[] args) {
        Garaje garaje = new Garaje(50, 5);
        garaje.ingresarVehiculo(new Coche("Ford", 20000, 4));
        garaje.ingresarVehiculo(new Coche("BMW", 15000, 2));
        garaje.ingresarVehiculo(new Moto("Yamaha", 10000, 600));
        garaje.ingresarVehiculo(new Moto("Honda", 8000, 750));
        System.out.println("____//_]|________         ____//__][__][___|     ____//__][______||\n" +
                "(o _ |  -|   _  o|        (o  _|  -|     _ o|    (o _ |  -|   _   o|\n" +
                " `(_)-------(_)--'         `-(_)--------(_)-'     `(_)-------(_)---'");
        garaje.imprimirInformacionGaraje();
        garaje.imprimirInformacionVehiculos();
        System.out.println("(|\n" +
                "                                                   ||_    \n" +
                "                                                  =///`\\   \n" +
                "                             (\\                   \\\\\\) | \n" +
                "                            __\\\\                   `|~~|    \n" +
                "                           (((<_|            ____   |  |     \n" +
                "                            `-__/\\         /~    ~\\|   |    \n" +
                "                               \\  ~-_     |--|     |___|    \n" +
                "                                `\\   ~-_  |_/     /--__/   \n" +
                "                                  `\\/ / ~-_\\___--/    /   \n" +
                "                                    `-_    ~/   /    /   \n" +
                "                                       ~-_ /   |   _/   \n" +
                "                                          |         |\n" +
                "                                         |~~~~~-----| \n" +
                "                                         |___----~~~/\n" +
                "              _-~~\\                       \\_       /\n" +
                "            /(_|_-~                       |       /                          \n" +
                "          /   /~==[]\\     ____-------_    |_____--|   ______________       \n" +
                "        /    (_ //(\\0)~~~~    YAMAHA  ~\\ /_-       \\/'         ___/ ~~~~/  \n" +
                "       (|      ~~--__                   |/         )_____---~~~    YZF  \\    \n" +
                "        \\.      ___  ~~--__ ____        /        _-/              __--~~'  \n" +
                "          ~\\    \\\\\\\\       ~~-_ ~-____ /      _-~~          __--~~___ \n" +
                "     _ ----/ \\    \\\\\\\\         ~-_    /---__-~        __--~~----~~_  ]=\n" +
                "  _-~ ___ / /__\\   ~~~            ~-_ ( )-~ ~-_~~~/~~~ _-~         ~-_ \n" +
                " /-~~~_-|/ /    ~\\                  _) ~-_     \\ /~~~~~---__-----_    \\\n" +
                ";    / \\/_//`\\    \\           __--~~/_   \\~-_ _-\\ ~~~~~~~~~~~~-/_/\\    .\n" +
                "|   | \\((*))/ |   |\\    __--~~     /o \\   `\\ ~-  `\\----_____( 0) ) |   | \n" +
                "|    \\  |~|  /    | )-~~           \\ 0 )    |/' _-~/~--------| |~ /    ,\n" +
                " \\    ~-----~    / /                ~~~~~~~~/_/O_/'   \\    ~-----~    /\n" +
                "  ~-_         _-~ `---------------------------'        `-_         _-~\n" +
                "     ~ ----- ~                                            ~ ----- ~  -TX");
    }
}

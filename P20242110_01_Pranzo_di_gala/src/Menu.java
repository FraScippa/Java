public class Menu {

    private final Pietanza[] primi = {
            new Pietanza("Spaghetti alla carbonara", 12.50, 600),
            new Pietanza("Bucatini Amatriciana", 8.50, 300),
            new Pietanza("Vellutata", 7, 200),
            new Pietanza("Risotto alla milanese", 11.50, 250),
            new Pietanza("Polenta e osei", 9, 150),
            new Pietanza("Ravioli", 13.25, 275),
            new Pietanza("Lasagne alla bolognese", 14.15, 455),
            new Pietanza("Tortellini in brodo", 10.75, 625),
            new Pietanza("Risotto alla bolognese", 9.75, 315),
            new Pietanza("Pasta al sugo", 8, 300)
    };
    private final Pietanza[] secondi = {
            new Pietanza( "Ossobuco", 12.50, 600),
            new Pietanza( "Bistecca", 8.50, 300),
            new Pietanza( "Cotoletta alla milanese", 7, 200),
            new Pietanza( "Polpette al sugo", 11.50, 250),
            new Pietanza( "Involtini primavera", 9, 150),
            new Pietanza( "Spigola", 13.25, 275),
            new Pietanza( "Spinacine", 14.15, 455),
            new Pietanza( "Tagliata", 10.75, 625),
            new Pietanza( "Arrosticini", 9.75, 315),
            new Pietanza( "Branzino", 18.50, 300)
    };
    private final Pietanza[] contorni = {
            new Pietanza("Insalata", 12.50, 600),
            new Pietanza("Focaccia", 8.50, 300),
            new Pietanza("Cicoria ripassata", 7, 200),
            new Pietanza("Broccoli", 11.50, 250),
            new Pietanza("Fagioli", 9, 150),
            new Pietanza("Patatine fritte", 13.25, 275),
            new Pietanza("Zucchine grigliate", 14.15, 455),
            new Pietanza("Patate al forno", 10.75, 625),
            new Pietanza("Melanzane grigliate", 9.75, 315),
            new Pietanza("Peperoni ripieni", 8, 300)
    };
    private final Pietanza[] dolci = {
            new Pietanza("Tiramisù", 12.50, 600),
            new Pietanza("Sorbetto", 8.50, 300),
            new Pietanza("Torta di visciole", 7, 200),
            new Pietanza("Cannoli", 11.50, 250),
            new Pietanza("Baba", 9, 150),
            new Pietanza("Torta di mele", 13.25, 275),
            new Pietanza("Panna cotta", 14.15, 455),
            new Pietanza("Fragole con panna", 10.75, 625),
            new Pietanza("Crostata", 9.75, 315),
            new Pietanza("Cassata", 8, 300)
    };
    private final Pietanza[][] pietanze = {
            primi,
            secondi,
            contorni,
            dolci
    };

    public Pietanza[][] getPietanze() {
        return pietanze;
    }
}

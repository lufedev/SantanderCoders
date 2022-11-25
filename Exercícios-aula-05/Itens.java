public enum Itens {
    MEMÓRIA_RAM("Memória ram ddr4", 500.0f),
    PROCESSADOR("Ryzen 5 3600", 1299.99f),
    AIRCOOLER("Noctua Cooler", 90.50f),
    GABINETE("Gabinete Coolermaster", 700.5f),
    FANS_RGB("Fans Coolermaster", 40.2f),
    HEADSET("Headset G-PRO X", 1000.5f),
    MOUSE("Razer DeathAdder", 300.0f),
    TECLADO("Redragon Kumara", 100.0f);

    private final String nome;
    private final float valor;

    Itens(String nome, float valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public float getValor() {
        return valor;
    }
}

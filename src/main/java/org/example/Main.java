package org.example;


import javax.print.Doc;

public class Main {

    public static void p(String texto)

    {
        System.out.println();
    }

    public static void l(String texto)

    {
        System.out.println("*********************************");
    }
    public static void main(String[] args) {

        Carro carro = new Carro();
        Moto moto = new Moto();

        carro.Acelerar();
        moto.Acelerar();
        p("");
        l("");

        Violao violao = new Violao();
        Piano piano = new Piano();

        violao.Tocar();
        piano.Tocar();
        p("");
        l("");

        Geladeira geladeira =  new Geladeira();
        Microondas microondas = new Microondas();

        geladeira.Ligar();
        geladeira.Desligar();
        microondas.Ligar();
        microondas.Desligar();
        p("");
        microondas.VerificarEstado();
        p("");
        l("");


        Quadrado quadrado = new Quadrado();
        Circulo circulo = new Circulo();

        quadrado.CalcularArea();
        circulo.CalcularArea();
        p("");
        l("");


        Gerente gerente = new Gerente();
        Programador programador = new Programador();

        gerente.CalcularSalario();
        programador.CalcularSalario();
        p("");
        l("");


        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.Sacar();
        contaCorrente.Depositar();
        contaCorrente.VerSaldo();
        p("");
        l("");

        Calculadora calculadora = new Calculadora();
        CalculadoraCientifica calculadoraCientifica = new CalculadoraCientifica();

        calculadora.Somar();
        calculadora.Subtrair();
        calculadora.Multiplicar();
        calculadora.Dividir();
        p("");
        calculadoraCientifica.Somar();
        calculadoraCientifica.Subtrair();
        calculadoraCientifica.Multiplicar();
        calculadoraCientifica.Dividir();
        calculadoraCientifica.Potencial();

        p("");
        l("");

        Documento documento = new Documento();
        Imagem imagem = new Imagem();

        documento.Imprimir();
        imagem.Imprimir();
        documento.MostrarMonitor();

        p("");
        l("");

        Passaro passaro = new Passaro();

        passaro.Comer();
        passaro.Voar();
        passaro.dormir();
        p("");
        l("");

        Xadrez xadrez = new Xadrez();
        Futebol futebol = new Futebol();

        xadrez.IniciarJogo();
        futebol.IniciarJogo();
        p("");
        l("");

        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito();
        Boleto boleto = new Boleto();
        Pix pix = new Pix();

        cartaoDeCredito.Pagar();
        boleto.Pagar();
        pix.Pagar();
        p("");

        cartaoDeCredito.CancelarPagamento();
        pix.CancelarPagamento();


        p("");
        l("");

        ArquivoDeTexto arquivoDeTexto = new ArquivoDeTexto();
        BancoDeDados bancoDeDados = new BancoDeDados();

        arquivoDeTexto.Carregar();
        arquivoDeTexto.Salvar();
        p("");
        bancoDeDados.Carregar();
        bancoDeDados.Salvar();
        p("");
        l("");

        SensorDeTemperatura sensorDeTemperatura = new SensorDeTemperatura();
        SensorDePressao sensorDePressao = new SensorDePressao();

        sensorDeTemperatura.MedirTemperatura();
        sensorDePressao.MedirTemperatura();
        p("");
        l("");

        Televisao televisao = new Televisao();

        televisao.AumentarVolume();
        televisao.DiminuirVolume();
        p("");
        l("");

        Temperatura temperatura = new Temperatura();

        System.out.println(temperatura.converter(30));
        p("");
        l("");

        ContaPoupanca contaPoupanca = new ContaPoupanca();

        System.out.println("Taxa de juros " + contaPoupanca.taxaJuros() + "%");

        Matematica matematica = new Matematica();

        System.out.println(matematica.CalcularFatorial(5));
        p("");
        l("");

        Usuario usuario = new Usuario();

        System.out.println(usuario.mensagem());
        p("");
        l("");

        Relogio relogio = new Relogio();

        System.out.println("Hora atual: " + relogio.HoraAtual());

        p("");
        l("");

        Youtube youtube = new Youtube();
        Twitch twitch = new Twitch();

        youtube.IniciarTransmissao();
        youtube.FinalizarTransmissao();
        p("");
        twitch.IniciarTransmissao();
        twitch.FinalizarTransmissao();
        p("");
        l("");

        UsuarioSistema usuarioo = new UsuarioSistema();
        Administrador administrador = new Administrador();

        usuarioo.Login();
        usuarioo.Logout();
        p("");
        administrador.Login();
        administrador.Logout();
        p("");
        l("");

        Robo robo = new Robo();
        robo.MoverParaFrente();
        robo.MoverParaTras();
        p("");
        l("");

        RepositorioCliente repositorio = new RepositorioCliente();
        Cliente cliente = new Cliente();

        repositorio.Salvar(cliente);
        repositorio.Buscar(1);
        p("");
        l("");

        Spotify spotify = new Spotify();
        Deezer deezer = new Deezer();

        spotify.Play();
        spotify.Pause();
        spotify.Stop();
        p("");
        deezer.Play();
        deezer.Pause();
        deezer.Stop();
        l("");
        System.out.println(":)");

    }
}

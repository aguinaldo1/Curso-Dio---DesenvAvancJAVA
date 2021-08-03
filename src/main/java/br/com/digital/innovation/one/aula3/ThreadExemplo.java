package br.com.digital.innovation.one.aula3;

public class ThreadExemplo {
    public static void main(String[] args) {

        GeradorPDF iniciarGeradorPdf = new GeradorPDF();
        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPdf);

       iniciarGeradorPdf.start();
       iniciarBarraDeCarregamento.start();

    }
}


class GeradorPDF extends Thread {
    @Override
    public void run(){
        try {
            System.out.println("Iniciar geracao de PDF");
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado");
    }
}


class BarraDeCarregamento extends Thread{
    private Thread iniciarGeradorPdf;

    public BarraDeCarregamento(Thread iniciarGeradorPdf){
        this.iniciarGeradorPdf = iniciarGeradorPdf;
    }

    @Override
    public void run(){
            while (true){
                try {
                    Thread.sleep(500);

                    if (!iniciarGeradorPdf.isAlive()){
                        break;
                    }
                    System.out.println("Loading ...");

                }catch (InterruptedException e){
                    e.printStackTrace();
                }

            }

    }
}


class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
         try {
            Thread.sleep(3000);
            System.out.println("rodei : BarraDeCarregamento2 : " );
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}


class BarraDeCarregamento3 extends Thread{
    @Override
    public void run(){
        try {
            Thread.sleep(1000);
            System.out.println("rodei : BarraDeCarregamento3 : ");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

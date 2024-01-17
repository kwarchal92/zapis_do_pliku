package pilki;

import java.io.*;

class plik //klasa plik
{
    String dane, dane1;

    public void czytajDane() //deklaracja i definicja metody czytajDane().
        throws IOException
        {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Podaj imię i nazwisko");
            dane = br.readLine();
        }

    public void zapiszdanedoPliku()
        throws IOException
    {
        System.out.println("Zapisujemy dane do pliku dane.txt");
        FileWriter fw = new FileWriter("dane.txt");
        fw.write(dane);
        fw.close(); //zamkniecie pliku
    }

    public void czytajdanezPliku()
        throws IOException
    {
        System.out.println("Odczytujemy dane z pliku dane.txt");
        System.out.println("");
        FileReader fr = new FileReader("dane.txt");
        BufferedReader br = new BufferedReader(fr);
        while ((dane1 = br.readLine()) != null) //petla odczytuje dane z pliku
        {
            System.out.print(dane1);
        }
        fr.close(); //zamkniecie pliku
    }
} //koniec klasy o nazwie plik

public class Main
{
    public static void main(String[] args)
        throws IOException
    {
        plik plik1 = new plik();

        plik1.czytajDane(); //wywolanie metody czytajDane()
        plik1.zapiszdanedoPliku(); //wywolanie metody zapiszdanedoPliku()
        plik1.czytajdanezPliku(); //wywolanie metody czytajdanezPliku()
    }
}

package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Exchange exchange = new Exchange();
        Scanner scanner = new Scanner(System.in);
        System.out.println("HELP: \n - 1 - schimba bani\n"
                + "\tLa aceasta metoda i se va cere utilizatorului suma de bani (in RON) pe care vrea sa o schimbe si moneda rezultata (inca un switch pentru tipul de moneda pe String)\n"
                + "\tSe va afisa suma schimbata in moneda preferata\n"
                + "- 2 - schimba cursul unei monezi\n"
                + "\t-Se va cere utilizatorului moneda careia doreste sa schimbe cursul si valoarea noului curs.\n"
                + "- 3 - se iese din program.\n"
                + "\tPentru a iesi din program se va folosi metoda \"System.exit(0);\"");
        while(true)
        {
            System.out.print("Introduceti Optiunea:");
            int number = Integer.parseInt(scanner.nextLine());

            switch (number)
            {
                case 1: {
                    System.out.print("Introduceti suma: ");
                    double sum = Double.parseDouble(scanner.nextLine());
                    System.out.print("Introduceti moneda: EUR/USD/GBP: ");
                    String moneda = scanner.nextLine().toUpperCase();
                    switch (moneda)
                    {
                        case "EUR": {
                            System.out.println(sum / exchange.getEur_ron());
                        }
                        break;
                        case "USD": {
                            System.out.println(sum / exchange.getUsd_ron());
                        }
                        break;
                        case "GBP": {
                            System.out.println(sum / exchange.getGbp_ron());
                        }
                        break;
                        default:
                            System.out.println("Nu avem moneda precizata");

                    }
                }
                break;
                case 2: {
                    System.out.print("Introduceti moneda: EUR/USD/GBP: ");
                    String moneda = scanner.nextLine().toUpperCase();
                    System.out.print("Introduceti cursul nou: ");
                    double curs = Double.parseDouble(scanner.nextLine());
                    switch (moneda)
                    {
                        case "EUR": {
                            exchange.setEur_ron(curs);
                        }
                        break;
                        case "USD": {
                            exchange.setUsd_ron(curs);
                        }
                        break;
                        case "GBP": {
                            exchange.setGbp_ron(curs);
                        }
                        break;
                        default:
                            System.out.println("Nu avem moneda precizata");

                    }
                }
                break;
                case 3: {
                    scanner.close();
                    System.exit(0);
                }
                break;
                default:
                    System.out.println("Nu exista optiunea");
            }
        }

    }
    }


package compraclientes;

import java.util.Scanner;

public class CompraClientes {

    
    public static void main(String[] args) {
                
        double v_total1, v_total2, v_total3, v_total4, v_total5;
        double v_final1 = 0, v_final2 = 0, v_final3 = 0, v_final4 = 0, v_final5 = 0;
        double desconto1 = 0, desconto2 = 0, desconto3 = 0, desconto4 = 0, desconto5 = 0;
        double juros1 = 0, juros2 = 0, juros3 = 0, juros4 = 0, juros5 = 0;
        double parcela1 = 0, parcela2 = 0, parcela3 = 0, parcela4 = 0, parcela5 = 0;
        double total_vista = 0;
        double total_parcelado = 0;
        double total_descontos = 0;
        double total_juros = 0;
        int regra_pgto1,regra_pgto2, regra_pgto3, regra_pgto4, regra_pgto5;
                
        Scanner entrada = new Scanner(System.in);
        System.out.println("====================    Compra 01    ====================");
        System.out.println("Digite o valor total: ");
        v_total1 = entrada.nextDouble();
        System.out.println("");
        System.out.println("==========   Forma de pagamento   ==========");
        System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
        regra_pgto1 = entrada.nextInt();
        
        while (regra_pgto1 != 1 && regra_pgto1 != 2 && regra_pgto1 != 3 && regra_pgto1 != 4) {
            System.out.println("Opcao invalida!");
            System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
            regra_pgto1 = entrada.nextInt();
        }
            if (regra_pgto1 == 1) {
                desconto1 = v_total1 * 0.08;
                total_descontos = total_descontos + desconto1;
                v_final1 = v_total1 - desconto1;
                total_vista = total_vista + v_final1;
                }else if (regra_pgto1 == 2) {                 
                    desconto1 = v_total1 * 0.04;
                    total_descontos = total_descontos + desconto1;
                    v_final1 = v_total1 - desconto1;
                    total_vista = total_vista + v_final1;
                }else if (regra_pgto1 == 3) {
                    v_final1 = v_total1;
                    parcela1 = v_final1 / 2;
                    total_parcelado = total_parcelado + v_final1;
                }else if (regra_pgto1 == 4) {                
                    juros1 = v_total1 * 0.08;
                    total_juros = total_juros + juros1;
                    v_final1 = v_total1 + juros1;
                    parcela1 = v_final1 / 4;
                    total_parcelado = total_parcelado + v_final1;
                }
            
            System.out.println("");
            System.out.println("==========   Resumo Compra 01:   ==========");
            System.out.printf("Valor total da compra: %.2f%n", v_total1);
            System.out.println("Forma de pagamento: "+regra_pgto1);
                if (regra_pgto1 == 3 || regra_pgto1 == 4) {
                    System.out.printf("O valor de cada parcela sera: %.2f%n", parcela1);
                }
            System.out.printf("Desconto: %.2f%n", desconto1);
            System.out.printf("Juros: %.2f%n", juros1);
            System.out.printf("Valor final da compra: %.2f%n", v_final1);
            
            
            System.out.println("");
            System.out.println("====================    Compra 02    ====================");
            System.out.println("Digite o valor total: ");
            v_total2 = entrada.nextDouble();
            System.out.println("");
            System.out.println("==========   Forma de pagamento   ==========");
            System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
            regra_pgto2 = entrada.nextInt();

            while (regra_pgto2 != 1 && regra_pgto2 != 2 && regra_pgto2 != 3 && regra_pgto2 != 4) {
                System.out.println("Opcao invalida!");
                System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                regra_pgto2 = entrada.nextInt();
            }
                if (regra_pgto2 == 1) {
                desconto2 = v_total2 * 0.08;
                total_descontos = total_descontos + desconto2;
                v_final2 = v_total2 - desconto2;
                total_vista = total_vista + v_final2;
                }else if (regra_pgto2 == 2) {                 
                    desconto2 = v_total2 * 0.04;
                    total_descontos = total_descontos + desconto2;
                    v_final2 = v_total2 - desconto2;
                    total_vista = total_vista + v_final2;
                }else if (regra_pgto2 == 3) {
                    v_final2 = v_total2;
                    parcela2 = v_final2 / 2;
                    total_parcelado = total_parcelado + v_final2;
                }else if (regra_pgto2 == 4) {                
                    juros2 = v_total2 * 0.08;
                    total_juros = total_juros + juros2;
                    v_final2 = v_total2 + juros2;
                    parcela2 = v_final2 / 4;
                    total_parcelado = total_parcelado + v_final2;
                    }

                System.out.println("");
                System.out.println("==========   Resumo Compra 02:   ==========");
                System.out.printf("Valor total da compra: %.2f%n", v_total2);
                System.out.println("Forma de pagamento: "+regra_pgto2);
                    if (regra_pgto2 == 3 || regra_pgto2 == 4) {
                        System.out.printf("O valor de cada parcela sera: %.2f%n", parcela2);
                    }
                System.out.printf("Desconto: %.2f%n", desconto2);
                System.out.printf("Juros: %.2f%n", juros2);
                System.out.printf("Valor final da compra: %.2f%n", v_final2);
                
                
                System.out.println("");
                System.out.println("====================    Compra 03    ====================");
                System.out.println("Digite o valor total: ");
                v_total3 = entrada.nextDouble();
                System.out.println("");
                System.out.println("==========   Forma de pagamento   ==========");
                System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                regra_pgto3 = entrada.nextInt();

                while (regra_pgto3 != 1 && regra_pgto3 != 2 && regra_pgto3 != 3 && regra_pgto3 != 4) {
                    System.out.println("Opcao invalida!");
                    System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                    regra_pgto3 = entrada.nextInt();
                }
                    if (regra_pgto3 == 1) {
                    desconto3 = v_total3 * 0.08;
                    total_descontos = total_descontos + desconto3;
                    v_final3 = v_total3 - desconto3;
                    total_vista = total_vista + v_final3;
                    }else if (regra_pgto3 == 2) {                 
                        desconto3 = v_total3 * 0.04;
                        total_descontos = total_descontos + desconto3;
                        v_final3 = v_total3 - desconto3;
                        total_vista = total_vista + v_final3;
                    }else if (regra_pgto3 == 3) {
                        v_final3 = v_total3;
                        parcela3 = v_final3 / 2;
                        total_parcelado = total_parcelado + v_final3;
                    }else if (regra_pgto3 == 4) {                
                        juros3 = v_total3 * 0.08;
                        total_juros = total_juros + juros3;
                        v_final3 = v_total3 + juros3;
                        parcela3 = v_final3 / 4;
                        total_parcelado = total_parcelado + v_final3;
                        }

                    System.out.println("");
                    System.out.println("==========   Resumo Compra 03:   ==========");
                    System.out.printf("Valor total da compra: %.2f%n", v_total3);
                    System.out.println("Forma de pagamento: "+regra_pgto3);
                        if (regra_pgto3 == 3 || regra_pgto3 == 4) {
                            System.out.printf("O valor de cada parcela sera: %.2f%n", parcela3);
                        }
                    System.out.printf("Desconto: %.2f%n", desconto3);
                    System.out.printf("Juros: %.2f%n", juros3);
                    System.out.printf("Valor final da compra: %.2f%n", v_final3);
                    
                    
                    System.out.println("");
                    System.out.println("====================    Compra 04    ====================");
                    System.out.println("Digite o valor total: ");
                    v_total4 = entrada.nextDouble();
                    System.out.println("");
                    System.out.println("==========   Forma de pagamento   ==========");
                    System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                    regra_pgto4 = entrada.nextInt();

                    while (regra_pgto4 != 1 && regra_pgto4 != 2 && regra_pgto4 != 3 && regra_pgto4 != 4) {
                        System.out.println("Opcao invalida!");
                        System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                        regra_pgto4 = entrada.nextInt();
                    }
                        if (regra_pgto4 == 1) {
                        desconto4 = v_total4 * 0.08;
                        total_descontos = total_descontos + desconto4;
                        v_final4 = v_total4 - desconto4;
                        total_vista = total_vista + v_final4;
                        }else if (regra_pgto4 == 2) {                 
                            desconto4 = v_total4 * 0.04;
                            total_descontos = total_descontos + desconto4;
                            v_final4 = v_total4 - desconto4;
                            total_vista = total_vista + v_final4;
                        }else if (regra_pgto4 == 3) {
                            v_final4 = v_total4;
                            parcela4 = v_final4 / 2;
                            total_parcelado = total_parcelado + v_final4;
                        }else if (regra_pgto4 == 4) {                
                            juros4 = v_total4 * 0.08;
                            total_juros = total_juros + juros4;
                            v_final4 = v_total4 + juros4;
                            parcela4 = v_final4 / 4;
                            total_parcelado = total_parcelado + v_final4;
                        }

                        System.out.println("");
                        System.out.println("==========   Resumo Compra 04:   ==========");
                        System.out.printf("Valor total da compra: %.2f%n", v_total4);
                        System.out.println("Forma de pagamento: "+regra_pgto4);
                            if (regra_pgto4 == 3 || regra_pgto4 == 4) {
                                System.out.printf("O valor de cada parcela sera: %.2f%n", parcela4);
                            }
                        System.out.printf("Desconto: %.2f%n", desconto4);
                        System.out.printf("Juros: %.2f%n", juros4);
                        System.out.printf("Valor final da compra: %.2f%n", v_final4);
                        
                        
                        System.out.println("");
                        System.out.println("====================    Compra 05    ====================");
                        System.out.println("Digite o valor total: ");
                        v_total5 = entrada.nextDouble();
                        System.out.println("");
                        System.out.println("==========   Forma de pagamento   ==========");
                        System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                        regra_pgto5 = entrada.nextInt();

                        while (regra_pgto5 != 1 && regra_pgto5 != 2 && regra_pgto5 != 3 && regra_pgto5 != 4) {
                            System.out.println("Opcao invalida!");
                            System.out.println("Digite 1 para pagamento a vista, com 8% de desconto;\nDigite 2 para pagamento a vista no cartao, com 4% de desconto;\nDigite 3 para parcelar em 2x, sem juros;\nDigite 4 para parcelar em 4x, com acrescimo de 8%.");
                            regra_pgto1 = entrada.nextInt();
                        }
                            if (regra_pgto5 == 1) {
                            desconto5 = v_total5 * 0.08;
                            total_descontos = total_descontos + desconto5;
                            v_final5 = v_total5 - desconto5;
                            total_vista = total_vista + v_final5;
                            }else if (regra_pgto5 == 2) {                 
                                desconto5 = v_total5 * 0.04;
                                total_descontos = total_descontos + desconto5;
                                v_final5 = v_total5 - desconto5;
                                total_vista = total_vista + v_final5;
                            }else if (regra_pgto5 == 3) {
                                v_final5 = v_total5;
                                parcela5 = v_final5 / 2;
                                total_parcelado = total_parcelado + v_final5;
                            }else if (regra_pgto5 == 4) {                
                                juros5 = v_total5 * 0.08;
                                total_juros = total_juros + juros5;
                                v_final5 = v_total5 + juros5;
                                parcela5 = v_final5 / 4;
                                total_parcelado = total_parcelado + v_final5;
                                }

                            System.out.println("");
                            System.out.println("==========   Resumo Compra 05:   ==========");
                            System.out.printf("Valor total da compra: %.2f%n", v_total5);
                            System.out.println("Forma de pagamento: "+regra_pgto5);
                                if (regra_pgto5 == 3 || regra_pgto5 == 4) {
                                    System.out.printf("O valor de cada parcela sera: %.2f%n", parcela5);
                                }
                            System.out.printf("Desconto: %.2f%n", desconto5);
                            System.out.printf("Juros: %.2f%n", juros5);
                            System.out.printf("Valor final da compra: %.2f%n", v_final5);
                            
                            System.out.println("");
                            System.out.println("===================================================");
                            System.out.printf("Total de compras a vista: %.2f%n", total_vista);
                            System.out.printf("Total de compras parceladas: %.2f%n", total_parcelado);
                            System.out.printf("Total de descontos: %.2f%n", total_descontos);
                            System.out.printf("Total de juros: %.2f%n", total_juros);
    }
    
}

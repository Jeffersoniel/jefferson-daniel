public class FloriculturaMain {                                                              
    public static void main(String[] args) {                                                                                                       	                                 

        Venda sistema = new Venda();           

        Flor f1 = new Flor("Ice", 10.0, "Paredez");                                            
        Flor f2 = new Flor("Cubana", 15.0, "Henricoptero");                                                                        
        Flor f3 = new Flor("Pacifa", 12.0, "Golle");                                                                                                                                

        sistema.adicionarVenda(f1);                                                                  
        sistema.adicionarVenda(f2);                                                          
        sistema.adicionarVenda(f3);                                                          
                                                                                             
        System.out.println("Vendas para Paredez:");                                                                                                                            
        System.out.println("Vendas para Henricoptero:"); 
        System.out.println("Vendas para Golle:"); 

        for (Flor f : sistema.obterListaDeFlor("Paredez")) {                                   
            System.out.println("- Flor: " + f.getFlor() + " | Preço: R$" + f.getValor());    
        }                                                                                    
    } 
} 

package pilhainterface;
public class Pilha implements CriandoMetodosDaPilha{
    //já redeclaramos os métodos da INTERFACE, para podermos programar-los
    //so que como toda classe, precisamos iniciar os métodos construtores, o com parãmetro e o sem parãmetro.
    //precisamos de um atributo "topoDaPilha" to tipo "int";
    private int topoDaPilha;//este será um atributo da pilha, com ele poderemos verificar qual é o objeto que está no topo da pilha;
    private int tamanhoDaPilha;//aki será o tamanho da pilha, um exemplo teremos uma pilha de tamanho = 10, ficará de 0 á 9, este atributo tamanhoDaPilha iremos inicializar nos construtores.
    private Object objetosDaPilha[];//este atributo é "object", pois teremos que pegar dados do usuário certo? esse tipo "Object", nos permite usar os tipos int, float, String, char etc.. e de fato vamos usar na classe Veiculo atributos como String marca, modelo; int anoDeFabricacao;
    //e o atributo será um vetor, pois este vetor = "objetosDaPilha[]" irá armazenar os dados que o usuário digitar.
    
    //Bom vamos iniciar os métodos construtores... //método construtor que inicializa a "PILHA vazia";
    //iniciando o topoDaPilha vazia;
    public Pilha(){
        topoDaPilha = -1;//topo da pilha = -1, pois é um posição inexistente começando vazia .. = -1, quando já tem o primeiro objeto então começara com 0;
        tamanhoDaPilha = 30;//aki estamos opcionalmente definindo o tamanho da pilha.     
        objetosDaPilha = new Object[tamanhoDaPilha];//aki diz objetosDaPilha(VETOR) recebe tamanhoDaPilha ou seja 30 OBJETOS//e como se estivesse Guardando 30 objetos dentro do VETOR
        //o vetor recebe o tamanhoDaPilha[30];//está guardando os dados no vetor 
    }

    //Mais um método construtor//método construtor que inicializa a pilha com tamanho máximo desejado;
    
    public Pilha(int qtd){
        topoDaPilha = -1;//iniciando a pilha vazia;
        tamanhoDaPilha = qtd;//qtd será o tamanho que o usuario desejará alocar mémoria para a PILHA;
        objetosDaPilha = new Object[tamanhoDaPilha];//vetor recebendo o tamanho da pilha;
    }
    
    //método que verificar se a PILHA está vazia faremos isso com o tipo primitivo BOOLEAN, que resultará em TRUE OR FALSE;  
    @Override//Esse @Override significa que este método abaixo está sendo redeclarado aki, pois este método ja existe em uma INTERFACE.
    public boolean EstaVazio() {
        return(topoDaPilha == -1);//se o topo da pilha for = -1(OBJETO INEXISTENTE) retorne TRUE(Verdadeiro);       
    }

    @Override
    public boolean EstaCheio() {
        return(topoDaPilha == tamanhoDaPilha -1);//topo da pilha, quando a quantidade de objetos que tem na pilha for igual ao tamanhoDaPilha(tamanhoDaPilha que é a quantidade que o usuário digitou digamos que ele digitou 10), irá de 0 á 9
        //e por isso que o topoDaPilha tem que ser igual tamanhoDaPilha -1 (que o usuario digitou = 10) e vai de 0 a 9, se eu não colocar o -1, (irá de 0 á 10) contendo 11 objetos, e o usuário não pediu 11 objetos (pediu apenas 10, por isso o -1);
    }

    @Override
    //O tipo Object não precisa do @Override;
    public Object AdicionarDado(Object x) {
        if(!EstaCheio()){//se a PILHA não estiver cheio então ... da para adicionar mais um objeto no vetor...
            //teremos que adicionar mais um dado ao vetor;
            objetosDaPilha[++ topoDaPilha] = x;//vetor[++ topoDaPilha] = x; <-- estou dizendo que está formula será guardada no x, pois precisamos retornar algo;
            return x;//se não estiver o vetor não estiver cheio, guarde mais um elemento no vetor, e atribuimos a formula a variável = x, para poder retornar esse x;
        }else{//senão SE O VETOR ESTIVER CHEIO...
            return null;//retorne NULL, ou seja não permita mais adicionar objetos, (por como eu disse o usuario quer 10 objetos) e não 11 ou 12;
        }
    }

    @Override
    public Object ExcluiUltimoItem() {
        //se ++ é adicionar, -- é excluir;
        //1° verificar se tem item para excluir;
        if(!EstaVazio()){//se não estiver vazio.. Conferindo para ver se tem algum objeto para podermos excluir, se tiver...
            return objetosDaPilha[topoDaPilha--];//vetor = --topoDaPilha ---> ou seja excluindo o ultimo dado da PILHA, vetor excluindo o ultimo dado da PILHA
        }else{//senão significa não tem elementos no vetor, então não tem como excluir algo, por isso retornamos NULL;
            return null;
            //erro corrigdo estava colocando objetosDaPilha[--topoDaPilha];
            //o certo é objetosDaPilha[topoDaPilha--];
        }       
    }
    
    @Override
    public Object MostrarUltimoItem(){
        //lembrar: Conferir se tem algum dado na PILHA(vetor);
        if(!EstaVazio()){
            return objetosDaPilha[topoDaPilha]; //está linha significa... -->  vetor = topoDaPilha(ou seja mostrando o ultimo dado inserido pelo usuário);
        }else{//se está vazio.. então retorne NULL;
            return null;
        }            
    }
    
    @Override
    public String toString(){
        //novamento verificar se está a pilha está vazia;
        if(!EstaVazio()){
            //vamos criar um variavel para poder guardar estes dados que tem na pilha(DADOS QUE O USUÁRIO DIGITOU);
            String dados = "";
            for(int i = 0; i <= topoDaPilha; i++){//erro corrigido usar o topoDaPilha, e não usar a propriedade LENGTH; e também usar o <=
                dados += "\n" + objetosDaPilha[i].toString();
            }
            return ("[PILHA: " + dados + "\n]");         
        }else return "PILHA Vazia!";
    
    }
}

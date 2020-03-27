package pilhainterface;

public interface CriandoMetodosDaPilha {

    public boolean EstaVazio();

    public boolean EstaCheio();

    public Object AdicionarDado(Object x);//"push" para insertar um novo objeto.//não esquecer do parãmetro(Object x), pois senão ocorrerá um erro na classe "Pilha"

    public Object ExcluiUltimoItem();//"pop", pop excluirá um item, esse item é o ultimo item adicionado na pilha;

    public Object MostrarUltimoItem();//"top" top fará com que mostre o ultimo item da pilha("ultimo dado inserido pelo usuário".)

    public String toString();//aki faremos com que mostre todos os dados que o usúario digitou.
}

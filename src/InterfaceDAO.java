import java.util.List;
// Supor que esta aplicação terá classes DAO, onde esta interface DAO
// irá ter como métodos obrigatórios de implementação os CRUDs (Create, Rename,
// Update e Delete) das classes.
// DAO -> Data Access Object -> Persitência de dados
public interface InterfaceDAO {
    public void salvar (String nome);
    public void atualizar (int id);
    public void deletar (int id);
    public List<Object> getAll();

    // Interface não consegue implementar atributos, logo,
    // se houver necessitade de se ter atributos em um objeto implementado,
    // tem que se criar uma classe mesmo.
}

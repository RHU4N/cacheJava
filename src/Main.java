//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner sc = new Scanner(System.in);

    List<Pessoa> banco = new ArrayList<>();
    banco.add(new Pessoa(1, "Rhuan", 20));
    banco.add(new Pessoa(2, "Maria", 22));
    banco.add(new Pessoa(3, "João", 25));
    banco.add(new Pessoa(4, "Ana", 19));
    banco.add(new Pessoa(5, "Carlos", 30));
    banco.add(new Pessoa(6, "Lucas", 21));
    banco.add(new Pessoa(7, "Fernanda", 24));
    banco.add(new Pessoa(8, "Pedro", 27));
    banco.add(new Pessoa(9, "Juliana", 23));
    banco.add(new Pessoa(10, "Rafael", 28));
    banco.add(new Pessoa(11, "Camila", 26));
    banco.add(new Pessoa(12, "Bruno", 29));
    banco.add(new Pessoa(13, "Aline", 22));
    banco.add(new Pessoa(14, "Diego", 31));
    banco.add(new Pessoa(15, "Patricia", 25));

    List<Pessoa> cache = new ArrayList<>();


    while (true) {
        IO.println("Digite o id de 1 a " + banco.size() + " ou 0 para sair ou " + (banco.size() + 1) + " para ver o cache:");
        int user = sc.nextInt();


        if (user == 0) {
            break;
        }

        if (user == banco.size() + 1) {
            cache.forEach(System.out::println);
            continue;
        }

        if (user < 1 || user > banco.size()) {
            IO.println("Usuário inválido");
            continue;
        }

        Pessoa pessoa = null;

        for (Pessoa p : cache) {
            if (p.getId() == user) {
                pessoa = p;
                break;
            }
        }
        if (pessoa != null) {
            IO.println("Encontrado no cache: " + pessoa);
        } else if (cache.size() == 10) {
            cache.removeFirst();
            for (Pessoa p : banco) {
                if (p.getId() == user) {
                    pessoa = p;
                    break;
                }
            }
            IO.println("Encontrado no Banco e adicionado no cache: " + pessoa);
            cache.add(pessoa);
        }else {
            for (Pessoa p : banco) {
                if (p.getId() == user) {
                    pessoa = p;
                    break;
                }
            }
            IO.println("Encontrado no Banco e adicionado no cache: " + pessoa);
            cache.add(pessoa);
        }
    }
}

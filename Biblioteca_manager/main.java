import java.util.*;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE BIBLIOTECA =====");
            System.out.println("1. Cadastrar livro");
            System.out.println("2. Cadastrar usuário");
            System.out.println("3. Listar livros");
            System.out.println("4. Listar usuários");
            System.out.println("5. Emprestar livro");
            System.out.println("6. Devolver livro");
            System.out.println("0. Sair");
            System.out.print("Escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    System.out.print("Autor: ");
                    String autor = sc.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = sc.nextLine();
                    biblioteca.cadastrarLivro(titulo, autor, isbn);
                    break;
                case 2:
                    System.out.print("Nome do usuário: ");
                    String nome = sc.nextLine();
                    System.out.print("ID do usuário (número): ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    biblioteca.cadastrarUsuario(nome, id);
                    break;
                case 3:
                    biblioteca.listarLivros();
                    break;
                case 4:
                    biblioteca.listarUsuarios();
                    break;
                case 5:
                    System.out.print("ISBN do livro: ");
                    String isbnEmprestar = sc.nextLine();
                    System.out.print("ID do usuário: ");
                    int idUsuario = sc.nextInt();
                    sc.nextLine();
                    biblioteca.emprestarLivro(isbnEmprestar, idUsuario);
                    break;
                case 6:
                    System.out.print("ISBN do livro a devolver: ");
                    String isbnDevolver = sc.nextLine();
                    biblioteca.devolverLivro(isbnDevolver);
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}

// =====================================

class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean disponivel = true;
    private Usuario emprestadoPara = null;

    public Livro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public String getIsbn() { return isbn; }
    public boolean isDisponivel() { return disponivel; }
    public Usuario getEmprestadoPara() { return emprestadoPara; }

    public void emprestarPara(Usuario usuario) {
        this.disponivel = false;
        this.emprestadoPara = usuario;
    }

    public void devolver() {
        this.disponivel = true;
        this.emprestadoPara = null;
    }

    public void exibirDados() {
        System.out.print("Título: " + titulo + "; Autor: " + autor + "; ISBN: " + isbn + "; Disponível: " + (disponivel ? "Sim" : "Não"));
        if (!disponivel && emprestadoPara != null) {
            System.out.print(" | Emprestado para: " + emprestadoPara.getNome() + " (ID: " + emprestadoPara.getId() + ")");
        }
        System.out.println();
    }
}

// =====================================

class Pessoa {
    private String nome;
    private int id;

    public Pessoa(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() { return nome; }
    public int getId() { return id; }

    public void setNome(String nome) { this.nome = nome; }
    public void setId(int id) { this.id = id; }
}

// =====================================

class Usuario extends Pessoa {
    public Usuario(String nome, int id) {
        super(nome, id);
    }

    public void exibirDados() {
        System.out.println("Usuário: " + getNome() + ", ID: " + getId());
    }
}

// =====================================

class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Usuario> usuarios = new ArrayList<>();

    public void cadastrarLivro(String titulo, String autor, String isbn) {
        livros.add(new Livro(titulo, autor, isbn));
        System.out.println("Livro cadastrado com sucesso!");
    }

    public void cadastrarUsuario(String nome, int id) {
        usuarios.add(new Usuario(nome, id));
        System.out.println("Usuário cadastrado com sucesso!");
    }

    public void listarLivros() {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado.");
        } else {
            for (Livro livro : livros) {
                livro.exibirDados();
                System.out.println("-----");
            }
        }
    }

    public void listarUsuarios() {
        if (usuarios.isEmpty()) {
            System.out.println("Nenhum usuário cadastrado.");
        } else {
            for (Usuario usuario : usuarios) {
                usuario.exibirDados();
                System.out.println("-----");
            }
        }
    }

    public Usuario buscarUsuarioPorId(int id) {
        for (Usuario u : usuarios) {
            if (u.getId() == id) return u;
        }
        return null;
    }

    public Livro buscarLivroPorIsbn(String isbn) {
        for (Livro l : livros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public void emprestarLivro(String isbn, int idUsuario) {
        Livro livro = buscarLivroPorIsbn(isbn);
        Usuario usuario = buscarUsuarioPorId(idUsuario);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        if (usuario == null) {
            System.out.println("Usuário não encontrado.");
            return;
        }
        if (!livro.isDisponivel()) {
            System.out.println("Livro já está emprestado.");
            return;
        }

        livro.emprestarPara(usuario);
        System.out.println("Livro emprestado com sucesso!");
    }

    public void devolverLivro(String isbn) {
        Livro livro = buscarLivroPorIsbn(isbn);

        if (livro == null) {
            System.out.println("Livro não encontrado.");
            return;
        }
        if (livro.isDisponivel()) {
            System.out.println("Este livro já está disponível.");
            return;
        }

        livro.devolver();
        System.out.println("Livro devolvido com sucesso!");
    }
}

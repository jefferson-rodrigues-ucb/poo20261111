package org.example.entities;

public class Autor {
    private int ID;
    private String nome;

    public Autor(int ID, String nome) {
        this.ID = ID;
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                '}';
    }
}

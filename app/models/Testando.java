package models;

import java.util.Date;

import javax.persistence.Entity;

import play.db.jpa.Model;
@Entity
public class Testando extends Model{

	public String nome;
	public String sobrenome;
	public Date dataNasc;
	public String endereco;

}

package controllers;

import java.util.List;

import models.Testando;
import play.mvc.Controller;

import models.*;
public class Teste extends Controller{
	
	public static void form() {
		render();
	}
	
	public static void listar() {
		List<Testando> Teste = Testando.findAll();
		render(Teste);
	}
	
	public static void salvar(Testando t) {
		t.save();
		listar();
	}
	
	public static void remover(Long id) {
		Teste teste = Teste.findById(id);
		if(teste != null) {
			teste.delete();
		}
		listar();
	}

}

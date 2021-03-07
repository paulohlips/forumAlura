package br.com.alura.forum.config;

public class ErroFormularioDto {

    private String campo;
    private String mensagem;

    public ErroFormularioDto(String campo, String mensagem){
        this.campo = campo;
        this.mensagem = mensagem;
    }

    public String getCampo(){
        return  this.campo;
    }

    public String getMensagem(){
        return this.mensagem;
    }
}

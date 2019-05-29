package com.pss.senha.validacao;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

final class DataTratador extends TratadorSenha {

    @Override
    public String aceitaSenha(String senha) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        try {
            if (!senha.contains("/")) {
                senha = senha.substring(0, 2) + "/" + senha.substring(2, 4) + "/" + senha.substring(4, senha.length());
            }
            Date data = df.parse(senha);
            return "A senha nao deve ser uma data;";
        } catch (ParseException | StringIndexOutOfBoundsException e) {
            return "";
        }
    }
}

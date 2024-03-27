/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EnviaEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Bruno Groehs
 */
public class EnviaEmail {
    public void enviaEmailCompleto(String nome, String hora, String dia){
            //a senha do seu email precisa ser criada em Segurança/autentificação/Senha para APP
            String meuEmail = "";//coloque seu email
            String minhaSenha = "";//coloque sua senha gerada no gmail

            SimpleEmail email = new SimpleEmail();

            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
            email.setSSLOnConnect(true);

            try {
                email.setFrom(meuEmail);
                String subject = "Cliente: " + nome + " agendou um horario.";
                String msg = "Agendamento para: " + dia + " às " + hora + " horas.";
                email.setSubject(subject);
                email.setMsg(msg);
                email.addTo(meuEmail);
                email.send();

                System.out.println("Deu certo");

            } catch (Exception e) {
                e.printStackTrace();
            }
    }  
}

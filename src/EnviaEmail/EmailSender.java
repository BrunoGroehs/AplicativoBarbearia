

package EnviaEmail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Bruno Groehs
 */
    
public class EmailSender {
    public static void main(String[] Args){
        while(true){
        //a senha do seu email precisa ser criada em Segurança/autentificação/Senha para APP
        String meuEmail = "brunospan33@gmail.com";
        String minhaSenha = "tixe yyhb qvac zqrk";
        
        SimpleEmail email = new SimpleEmail();
        
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(meuEmail);
            email.setSubject("Horario agendado:");
            email.setMsg("funcionou");
            email.addTo(meuEmail);
            email.send();
            
            System.out.println("Deu certo");
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    }}

 

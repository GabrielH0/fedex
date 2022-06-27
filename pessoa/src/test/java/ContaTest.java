import model.ContaCorrente;
import model.ContaPoupanca;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class ContaTest {

    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;

    @Before
    public void init() {
        contaCorrente = new ContaCorrente("0001");
        contaPoupanca = new ContaPoupanca("0002");
    }

    @Test
    public void depositarTeste() throws Exception {
        contaCorrente.depositar(100.00);
        Assert.assertEquals(100.00, contaCorrente.getSaldo(), 0.0);
    }

    @Test
    public void sacarTest() throws Exception {
        contaCorrente.depositar(50.00);
        contaCorrente.sacar(25.00);
        Assert.assertEquals(25.00, contaCorrente.getSaldo(), 0.0);
    }

    @Test
    public void sacarSaldoInsuficienteExceptionTest()  {
        Assert.assertThrows("Saldo insuficiente", Exception.class, () -> contaCorrente.sacar(10.00));
    }

    @Test
    public void sacarValorLimitePoupancaDeveRetornarException() throws Exception {
        contaPoupanca.depositar(10000.00);
        Assert.assertThrows(Exception.class, () -> contaPoupanca .sacar(2500.00));
    }

    @Test
    public void depositarValorLimiteContaCorrenteException() {
        Assert.assertThrows(Exception.class, () -> contaCorrente.depositar(6000.00));
    }
}

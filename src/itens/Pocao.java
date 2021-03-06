package itens;

public class Pocao extends Itens
{
    /** 
     * 'P': 10,
     * 'M': 25,
     * 'G': 60
     * @param tamanho 
     */
    private char tamanho;

    public Pocao() 
    {
        nome = "Poção";
        quantidade = 0; //A poção possui 3 usos
        atributo = 10;
        tamanho = 'P';
    }

    public void setPocao (char tamanho){
        this.tamanho = tamanho;
        switch (tamanho) {
            case 'P':
                atributo = 15;
                break;
            case 'M':
                atributo = 30;
                break;
            case 'G':
                atributo = 60;
                break;
            default:
                atributo = 0;
                break;
        }
    }

    public void setQuantidade(int quantidade) {
        if (quantidade > 3)
            this.quantidade = 3;
        else if (quantidade < 1) 
            this.quantidade = 0;
        else
            this.quantidade = quantidade;
    }

    @Override
    public int getAtributo() {
        if (quantidade == 0) 
            return 0;
        else if (quantidade > 0) {
            quantidade--;
        }
        return atributo;
    }

    @Override
    public String toString() {
        String estado;
        switch (quantidade) {
            case 1:
                estado = "Acabando";
                break;
            case 2:
                estado = "Metade";
                break;
            case 3:
                estado = "Cheia";
                break;
            default:
                estado = "Vazia";
                break;
        }
        return String.format("%s %c(%s)", nome, tamanho, estado);
    }

}

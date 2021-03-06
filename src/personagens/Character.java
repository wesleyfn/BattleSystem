package personagens;

import java.io.Serializable;

public abstract class Character implements Serializable
{
    protected String nome;
    protected int pvAtual, pvMax, xp, atk, def;

    public Character(String nome, int pv, int atk, int def, int xp) {
        this.nome = nome;
        this.atk = atk;
        this.def = def;
        this.xp = xp;
        pvAtual = pvMax = pv;
    }

    public int getDef() { return def; }
    public int getPvAtual() { return pvAtual; }
    public String getNome() { return nome; }
    public int getPvMax() { return pvMax; }


    public void adicionarPv(int add) {
        pvAtual = pvAtual + add;
        if(pvAtual > pvMax) pvAtual = pvMax;
        else if(pvAtual < 0) pvAtual = 0;
    }

    public void subtrairPv(int sub) {
        if (sub < 1) {
            adicionarPv(-1);
        }
        else {
            adicionarPv(-sub);
            if(pvAtual < 0) pvAtual = 0;
        }
    }

    public String toStringPV() {
        String str = String.format(" %-24s PV:%3d/%3d", nome, pvAtual, pvMax);
        return str;
    }
}

package org.uniquindio.edu.co.poo;

public class PlanFunerario {
    private String ataud;
    private String ceremonia;
    private String flores;
    private boolean transporte;
    private boolean cremacion;

    public void setAtaud(String ataud){this.ataud = ataud;}
    public void setCeremonia(String ceremonia){this.ceremonia = ceremonia;}
    public void setFlores(String flores){this.flores = flores;}
    public void setTransporte(boolean transporte){this.transporte = transporte;}
    public void setCremacion(boolean cremacion){this.cremacion = cremacion;}

    @Override
    public String toString(){
        return "Paquete funerario" + "Ataud" + ataud + "Ceremonia" + ceremonia + "Flores" + flores
                + "Transporte" + transporte + "Cremacion" + cremacion;
    }
    public static class Builder{
        private PlanFunerario plan;

        public Builder(){this.plan = new PlanFunerario();}
        public Builder ataud(String ataud){plan.setAtaud(ataud);return this;}
        public Builder ceremonia(String ceremonia){plan.setCeremonia(ceremonia); return this;}
        public Builder flores(String flores){plan.setFlores(flores); return this;}
        public Builder transporte(boolean transporte){plan.setTransporte(transporte); return this;}
        public Builder cremacion(boolean cremacion){plan.setCremacion(cremacion); return this;}
        public PlanFunerario build(){return plan;}
    }
}


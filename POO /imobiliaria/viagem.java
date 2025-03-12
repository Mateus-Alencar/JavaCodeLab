class viagem {
    
    private String origem;
    private String destino;
    private double distancia;
    private double duracao;
    
    public viagem(String origem, String destino, double distancia, double duracao){
        this.origem = origem;
        this.destino = destino;
        this.distancia = distancia;
        this.duracao = duracao;
    }
    
    public String getOrigem(){
        return this.origem;
    }
    public String getDestino(){
        return this.destino;
    }
    public double getDistancia(){
        return this.distancia;
    }
    public double getDurancao(){
        return this.duracao;
    }
    
    public void setOrigem(String o){
        this.origem = o;
    }
    public void setDestino(String des){
        this.destino = des;
    }
    public void setDistancia(double dis){
        this.distancia = dis;
    }
    public void setDurancao(double dur){
        this.duracao = dur;
    }
    
    public void mostrarDetalhes(){
        System.out.println("Origem:" + origem);
        System.out.println("Destino:" + destino);
        System.out.println("Distancia:" + distancia);
        System.out.println("Duração:" + duracao);
    }
}

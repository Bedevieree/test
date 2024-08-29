public class siswa{

    private int id;
    private String nama;
    private double ipk;

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return this.nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getIpk() {
        return this.ipk;
    }

    public void setIpk(double ipk) {
        this.ipk = ipk;
    }
    
    public siswa(){

        id = 0; 
        nama = "kosong";
        ipk = 0.0;
    }


        public void print(){
            System.out.println("id:   "+id);
            System.out.println("nama:   "+nama);
            System.out.println("ipk:   "+ipk);
        }

    }


        

    



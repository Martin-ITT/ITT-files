package keithquille_itt;

public abstract class AstronomicalBody 
{
    protected String Type;
    protected double Radius;
    protected String Surface;
    protected double Speed;
    protected double Distance;
    
    public AstronomicalBody()
    {
        //chained constructor
       this("Unknown",0,"Rock",0,0);
    }
    
    public AstronomicalBody(
            String TypeIn, double RadiusIn,
            String SurfaceIn,double SpeedIn,
            double DistanceIn)
    {
        //Type criteria
        if(TypeIn.equals("Planet") || TypeIn.equals("Moon") ||TypeIn.equals("Meteoroid"))
        {
            this.Type = TypeIn;
        }
        else
        {
            this.Type = "Unknown";
        }
        
        //Surface criteria
        if(SurfaceIn.equals("Gas") || SurfaceIn.equals("Rock"))
        {
            this.Surface = SurfaceIn;
        }
        else
        {
            this.Surface = "Rock";
        }
        
        this.Radius = RadiusIn;
        this.Speed = SpeedIn;
        this.Distance = DistanceIn;
        
    }
    
    //getter methods
    public String getType()
    {
        return this.Type;
    }
    public String getSurface()
    {
        return this.Surface;
    }
    public double getRadius()
    {
        return this.Radius;
    }
    public double getSpeed()
    {
        return this.Speed;
    }
    public double getDistance()
    {
        return this.Distance;
    }
    
    
    //setter methods
    public void setRadius(double RadiusIn)
    {
        if(RadiusIn >= 0)
        {
            this.Radius =  RadiusIn;
        }
        else
        {
            this.Radius = 0;
        }
    }
    
    public void setSpeed(double SpeedIn)
    {
        if(SpeedIn >= 0)
        {
            this.Speed =  SpeedIn;
        }
        else
        {
            this.Speed = 0;
        }
    }
    
    public void setDistance(double DistanceIn)
    {
        if(DistanceIn >= 0)
        {
            this.Distance =  DistanceIn;
        }
        else
        {
            this.Distance = 0;
        }
    }
    
    public void setSurface(String SurfaceIn)
    {
        if(SurfaceIn.equals("Gas") || SurfaceIn.equals("Rock"))
        {
            this.Surface = SurfaceIn;
        }
        else
        {
            this.Surface = "Rock";
        }
    }
    
    
    public double getMass()
    {
        if(this.Surface.equals("Rock"))
        {
            double mass = (4.0/3.0)
                    *Math.PI
                    *this.Radius*this.Radius*this.Radius;

            mass = mass * 5500000;

            return mass;
        }
        else if(this.Surface.equals("Gas"))
        {
            double mass = (4.0/3.0)
                    *Math.PI
                    *this.Radius*this.Radius*this.Radius;

            mass = mass * 1.977;

            return mass;
        }
        else
        {
            return -1;
        }
    }
    
    public double getOrbitalYear()
    {
        double days = 2.0*Math.PI*this.Distance;
        
        days = days / (this.Speed * 8580);
        
        return days;
    }
    
    public void print()
    {
        System.out.println("Type        :   "+this.Type);
        System.out.println("Radius      :   "+this.Radius);
        System.out.println("Surface     :   "+this.Surface);
        System.out.println("Speed       :   "+this.Speed);
        System.out.println("Distance    :   "+this.Distance);
        System.out.println("Mass        :   "+this.getMass());
        System.out.println("Orbital Year:   "+this.getOrbitalYear());
    }
    
    
}

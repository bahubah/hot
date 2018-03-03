class BookingController
{
    constructor()
    {
        this.bookingService = new BookingService();
    }
    
    // DATAController
    getAllBooking()
    {
        return this.bookingService.getAllBooking();
    }
    
    //ViewController
    
    getAllBookingView()
    {
        var data = this.getAllBooking();
        var result = "";
        result +=  "<table class='table'>"+
                                    "<tr>"+
                                        "<th>id</th>"+
                                        "<th>Client's number</th>"+
                                        "<th>Hotel number</th>"+
                                        "<th>The name of the hotel</th>"+
                                    "</tr>";
        for(var i=0; i<data.length;i++)
        {
            var id=data[i].id;
            var id_user=data[i].id_user;
            var id_content=data[i].id_content;
            var title1=data[i].title1;
            result +=   "<tr>"+
                            "<td>"+ id +"</td>"+
                            "<td>"+ id_user +"</td>"+
                            "<td>"+ id_content +"</td>"+
                            "<td>"+ title1 +"</td>"+
                        "</tr>";
                                
        
        }
        result += "</table>";
        var element =document.getElementById("booking");
        element.innerHTML = result;
    }
    
    getBookingById(id)
    {
        return this.bookingService.getBookingById(id);
    }
    
    //ViewController
   
    deleteBookingById(id)
    {
        return this.bookingService.deleteBookingById(id);
    }
    deleteBookingByIdView(id){
        this.deleteBookingById(id);
    }
    

    insertBooking(json)
    {
       return this.bookingService.insertBooking(json);    
    }
}
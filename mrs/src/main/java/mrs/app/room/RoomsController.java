package mrs.app.room;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mrs.domain.model.ReservableRoom;
import mrs.domain.service.RoomService;

@Controller
@RequestMapping("rooms")
public class RoomsController {
	@Autowired
	RoomService roomservice;

	@RequestMapping(method = RequestMethod.GET)
	String listRoom(Model model) {
		LocalDate today = LocalDate.now();
		List<ReservableRoom> rooms = roomService.findResevableRooms(today);
		model.addAttribute("date", today);
		model.addAttribute("rooms", rooms);
		return "room/listRooms";
	}
}

package cotato.cotatomanage.api;

import org.springframework.web.bind.annotation.RestController;
import lombok.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import cotato.cotatomanage.entity.Member;
import cotato.cotatomanage.entity.Part;
import cotato.cotatomanage.service.ManageService;
import cotato.cotatomanage.dto.AddMemberRequest;
import cotato.cotatomanage.dto.OrderByPartResponse;
@RequiredArgsConstructor
@RestController
public class PersonalApiController {
    private final ManageService memberService;
    @GetMapping("/print/{part}/member/{period}")
    public ResponseEntity<?> printAllMembersByPart(@PathVariable("part") String part, @PathVariable("period") int period) {
        return ResponseEntity.ok().body(memberService.printAllMembersByPart(period,part));
    }
}

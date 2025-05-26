import ok.PostMapping;
import ok.Student;

public class admin {
    @RestController
    @RequestMapping("/api/admin")
    public class AdminController {
        @Autowired
        private AdminService adminService;


        @PostMapping("/students")
        public ResponseEntity<Student> createStudent(@RequestBody Student student) {
            return ResponseEntity.ok(adminService.createStudent(student));
        }

        @GetMapping("/students/{id}")
        public ResponseEntity<Student> getStudent(@PathVariable Long id) {
            Object ResponseEntity;
            return ResponseEntity.ok(adminService.getStudent(id));
        }
    }
}

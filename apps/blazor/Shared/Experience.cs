namespace PersonalBlazorWebAssemblyApp.Shared
{
    public class Experience
    {
        public string? CompanyName { get; set; }
        public string? Description { get; set; }
        public string? EmploymentType { get; set; }
        public DateTime? EndDate { get; set; }
        public int ExperienceId { get; set; }
        public string? JobTitle { get; set; }
        public DateTime? StartDate { get; set; }
        public string? Link { get; set; }

        public static string ToShortStringDate(DateTime? date)
        {
            return date.HasValue ? date.Value.ToShortDateString() : "Present";
        }

        public string GetShortStartDate()
        {
            return ToShortStringDate(StartDate);
        }

        public string GetShortEndDate()
        {
            return ToShortStringDate(EndDate);
        }
    }
}

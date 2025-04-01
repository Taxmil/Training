import { Component } from '@angular/core';
import { NgFor } from '@angular/common';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-enquiry-form',
  standalone: true,
  imports: [NgFor, FormsModule],
  templateUrl: './enquiry-form.component.html',
  styleUrls: ['./enquiry-form.component.css']
})
export class EnquiryFormComponent {
  enquiry = { name: '', email: '', message: '' };

  onSubmit() {
    alert(`Enquiry Submitted: ${JSON.stringify(this.enquiry)}`);
  }
}
